function bookRoom() {
    // Get the form data
    const guestName = document.getElementById('guestName').value;
    const email = document.getElementById('email').value;
    const phoneNumber = document.getElementById('phoneNumber').value;
    const roomType = document.getElementById('roomType').value;
    const numberOfAdults = document.getElementById('numberOfAdults').value;
    const numberOfChildren = document.getElementById('numberOfChildren').value;
    const checkInDate = document.getElementById('checkInDate').value;
    const checkOutDate = document.getElementById('checkOutDate').value;
    const specialRequests = document.getElementById('specialRequests').value;
  
    // Create a JSON object with the form data
    const bookingData = {
      guestName,
      email,
      phoneNumber,
      roomType,
      numberOfAdults,
      numberOfChildren,
      checkInDate,
      checkOutDate,
      specialRequests
    };
  
    // Make the POST request to the backend API
    fetch( 'http://localhost:8080/api/bookings', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(bookingData)
    })
    .then(response => response.json())
    .then(data => {
      // Handle the response from the backend
      console.log(data); // Example: Log the response data
      // Perform any additional actions based on the response
    })
    .catch(error => {
      // Handle any errors that occur during the request
      console.error('Error:', error);
    });
  }
  function bookRoom() {
    // Perform the room booking process here
    // ...
  
    // Show the alert message
    alert('Room booked successfully!');
  
    // Prevent the form from submitting and refreshing the page
    return false;
  }
  
  