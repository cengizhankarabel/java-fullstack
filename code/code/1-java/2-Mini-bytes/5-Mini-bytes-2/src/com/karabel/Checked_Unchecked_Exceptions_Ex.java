package com.karabel;

class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message){
        super(message);
    }
}


//-------------------------------------------------------
// Transfer module : Author 'Nag'
//-------------------------------------------------------

class TransferService{
    public boolean doTransfer(double ticketAmount,String fromAcc,String toAcc) {
        double fromAccBalance=1000.00;
        if(ticketAmount>fromAccBalance){
            throw new InvalidAmountException("no enough funds");
        }
        System.out.println("transfer funds");
        return true;
    }
}


//-------------------------------------------------------
// Ticket booking : Author 'Nag'
//-------------------------------------------------------

class TicketBooking{

    TransferService transferService=new TransferService();

    public void bookTicket() {
        try {
            double ticketAmount = 5000.00;
            transferService.doTransfer(ticketAmount, "1", "2");
            System.out.println("ticket confirmed, happy travel");
        }catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
    }

}



public class Checked_Unchecked_Exceptions_Ex {
    public static void main(String[] args) {

    }
}