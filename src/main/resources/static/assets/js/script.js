// Handle 'Get Client by Last Name' form submission
document.getElementById('getClientByLastNameForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const lastName = document.getElementById('clientLName').value; // get last name from input field
    // get client by last name from server
    fetch(`http://localhost:8080/clients/byLastName/${lastName}`)
        .then(response => response.json())
        .then(data => {
            // check if data has array and has clients
           if(Array.isArray(data) && data.length > 0){
               let html = '<ul>'; // initialize unordered list for displaying clients

               // loop through each client and append to html
               data.forEach(client => {
                   html += `<li>First Name: ${client.clientFirstName}, Last Name: ${client.clientLastName}, Phone: ${client.clientPhoneNum}, Email: ${client.clientEmail}, Service: ${client.clientService}</li>`;
               });
               html += '</ul>'; // close unordered list
               document.getElementById('clientByLastNameResult').innerHTML = html;
           } else { //no clients are found
               document.getElementById('clientByLastNameResult').innerText = 'No clients found with the provided last name.';
           }
        })
        .catch(error => { // handles errors during fetch 
            document.getElementById('clientByLastNameResult').innerText = 'No client found with the provided last name';
        }); 
});

// Handle 'Create New Client' form submission
document.getElementById('createClientForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // creates a client oject from form inputs
    const client = {
        clientFirstName: document.getElementById('clientFirstName').value,
        clientLastName: document.getElementById('clientLastName').value,
        clientEmail: document.getElementById('clientEmail').value,
        clientPhoneNum: document.getElementById('clientPhoneNum').value,
        clientService: document.getElementById('clientService').value
    };

    // send new client data to server
    fetch('http://localhost:8080/clients', {
        method: 'POST', // specify request method
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(client)
    })
        .then(response => response.json())
        .then(data => {
            // display a success message for successful client creation
            document.getElementById('createResult').innerText = 'Client Stored.';
        })
        .catch(error => {
            // handle errors during fetch
            document.getElementById('createResult').innerText = 'Error: ' + error;
        });
});
