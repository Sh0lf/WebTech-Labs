function validateMyForm() {
    var firstName = document.getElementById('fName').value;
    var lastName = document.getElementById('lName').value;
    var birthdate = document.getElementById('bDay').value;

    if (firstName === '' || lastName === '' || birthdate === '') {
        alert('Please fill in all fields.');
    } else {
        var msg = 'First Name: ' + firstName + '\n';
        msg += 'Last Name: ' + lastName + '\n';
        msg += 'Birthdate: ' + birthdate + '\n';

        alert('Form Summary:\n\n' + msg);
    }
}

function toggleFM() {
    var fieldsets = document.getElementsByTagName('fieldset');
    var legends = document.getElementsByTagName('legend');

    var inputs = document.getElementsByTagName('input');
    var h1 = document.getElementById('titlePage');

    var selectedValue;
    var radios = document.getElementsByName('sex');
    for (var i = 0; i < radios.length; i++) {
        if (radios[i].checked) {
            selectedValue = radios[i].value;
            break;
        }
    }

    if (selectedValue === 'male') {
        for (var i = 0; i < fieldsets.length; i++){
            fieldsets[i].style.borderColor = 'blue';
            legends[i].style.color = 'blue';
        }
        for (var i = 0; i < inputs.length; i++) {
            if (inputs[i].type !== 'radio') {
                inputs[i].style.borderColor = 'blue';
            }
        }
        h1.innerText = 'Hello Sir';
    } else if (selectedValue === 'female') {
        for (var i = 0; i < fieldsets.length; i++){
            fieldsets[i].style.borderColor = 'red';
            legends[i].style.color = 'red';
        }
        for (var i = 0; i < inputs.length; i++) {
            if (inputs[i].type !== 'radio') {
                inputs[i].style.borderColor = 'red';
            }
        }
        h1.innerText = 'Hello Madam';
    }
}

