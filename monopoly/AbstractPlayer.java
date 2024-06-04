// package monopoly;

// public abstract class AbstractPlayer implements Player{

//     private String name;
//     private int funds;

//     /**
//      * abstract method.
//      */

//     protected AbstractPlayer(String name, int funds) {
//         this.name = name;
//         funds = 500;
//     }

//     @Override
//     public int getFunds() {
//         return funds;
//     }

//     @Override
//     public String getName() {
//         return name;
//     }

//     public void addFunds(int amount) {
//         funds += amount;
//     }

//     @Override
//     public boolean yourTurn(Dice d1, Dice d2) {
//         return true;
//     }
    
    
//     @Override
//     public int payRent(int amount) {
//         if(funds >= amount) {
//             funds -= amount;
//             return amount;
//         } else {
//             int payedAmount = funds;
//             funds = 0;
//             return payedAmount;
//         }
        
//     }
//     public boolean deduceFunds(int cost) {
//         if (funds > cost) {
//           funds -= cost;
//           return true;
//         } else {
//           return false;
//         }
//     }

// }
