function checkDNI() {
    var dni = document.getElementById("dni").value;
    var long = dni.length;

    if (long == 10) {
        alert(dni);
    } else {
        alert("DNI too long");
    }
}

function checkMail() {
    var format = /\S+@\S+\.\S+/;
    var email = document.getElementById("correu").value;

    if (format.test(email)) {
        alert(email);
    } else {
        alert("Bad Email");
    }
}

function checkName() {
    var name = document.getElementById("firstname").value;
    var long = name.length;

    if (long == 10) {
        alert(name);
    } else {
        alert("Name too long");
    }
}

function checkSurname() {
    var surname = document.getElementById("Llinatge").value;
    var long = surname.length;

    if (long == 20) {
        alert(surname);
    } else {
        alert("Surname too long");
    }
}

function checkSecondSurname() {
    var secondSurname = document.getElementById("Llinatge2").value;
    var long = secondSurname.length;

    if (long == 20) {
        alert(secondSurname);
    } else {
        alert("Surname too long");
    }
}

function allChecksInOne() {
    checkDNI();
    checkMail();
    checkName();
    checkSurname();
    checkSecondSurname();
}