// seats.js
const container = document.querySelector(".container");
const seats = document.querySelectorAll(".row .seat:not(.occupied)");
const count = document.getElementById("count");
const total = document.getElementById("total");
const movieSelect = document.getElementById("movie-select");
const showtimeSelect = document.getElementById("showtime-select");
const locationSelect = document.getElementById("location-select");

let ticketPrice = 0;

// Fetch seat availability for the selected show
function updateSeatAvailability() {
  const showId = showtimeSelect.value;
  fetch(`/api/shows/${showId}/seats`)
    .then(response => response.json())
    .then(seatsData => {
      seats.forEach((seat) => {
        seat.classList.remove('occupied');
      });
      seatsData.forEach((seatData, index) => {
        if (seatData.occupied) {
          seats[index].classList.add('occupied');
        }
      });
    })
    .catch(err => console.error("Failed to load seat availability:", err));
}

// Update ticket price based on selected movie
function updateTicketPrice() {
  const movieId = movieSelect.value;
  fetch(`/api/movies/${movieId}`)
    .then(response => response.json())
    .then(movie => {
      ticketPrice = movie.price;
      updateSelectedCount();
    })
    .catch(err => console.error("Failed to load movie price:", err));
}

// Update total and count
function updateSelectedCount() {
  const selectedSeats = document.querySelectorAll(".row .seat.selected");

  const selectedSeatsCount = selectedSeats.length;

  count.innerText = selectedSeatsCount;
  total.innerText = selectedSeatsCount * ticketPrice;
}

// Seat click event
container.addEventListener("click", (e) => {
  if (
    e.target.classList.contains("seat") &&
    !e.target.classList.contains("occupied")
  ) {
    e.target.classList.toggle("selected");

    updateSelectedCount();
  }
});

// Initialize
document.addEventListener('DOMContentLoaded', () => {
  updateTicketPrice();
  updateSeatAvailability();
});
