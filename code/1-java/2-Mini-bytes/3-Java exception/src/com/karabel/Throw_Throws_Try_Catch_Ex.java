package com.karabel;

// Checked Exception
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}


//-------------------------------------------------------
// Transfer module : Author 'Nag'
//-------------------------------------------------------

class TransferService{
    public boolean doTransfer(double ticketAmount,String fromAcc,String toAcc) throws InvalidAmountException{
        double fromAccBalance=1000.00;
        if(ticketAmount>fromAccBalance){
            throw new InvalidAmountException("no enough funds");
        }
        System.out.println("transfer funds");
        return true;
    }
}



//-------------------------------------------------------
// Ticket booking : Author 'Mary'
//-------------------------------------------------------

class TicketBooking{

    TransferService transferService=new TransferService();

    public void bookTicket() {

        double ticketAmount=5000.00;
        try {
            transferService.doTransfer(ticketAmount,"1","2");
            System.out.println("ticket confirmed, happy travel");
        } catch (InvalidAmountException e) {
            System.out.println("ticket booking failed "+e.getMessage());
        }



    }

}


public class Throw_Throws_Try_Catch_Ex {
    public static void main(String[] args) {

        TicketBooking ticketBooking=new TicketBooking();
        ticketBooking.bookTicket();

    }
}