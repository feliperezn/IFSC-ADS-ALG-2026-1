void main() {
    String dateInput, dateSuffix, month;
    int dateInt, monthInt;

    dateInput = IO.readln("Escreva a data em DD/MM/YYYY: ");
    String[] partes = dateInput.split("/");

    dateInt = Integer.parseInt(partes[0]);
    monthInt = Integer.parseInt(partes[1]);

    switch (dateInt) { // data
        case 1, 21, 31 -> dateSuffix = "st";
        case 2, 22 -> dateSuffix = "nd";
        case 3, 23 -> dateSuffix = "rd";
        default -> dateSuffix = "th";
    }

    switch (monthInt) { // mes
        case 1 -> month = "January";
        case 2 -> month = "February";
        case 3 -> month = "March";
        case 4 -> month = "April";
        case 5 -> month = "May";
        case 6 -> month = "June";
        case 7 -> month = "July";
        case 8 -> month = "August";
        case 9 -> month = "September";
        case 10 -> month = "October";
        case 11 -> month = "November";
        default -> month = "December";
    }

    IO.println(month + " " + dateInt + dateSuffix + ", " + partes[2]);
}