// package monopoly;

// import java.util.Random;

// public class AiPlayer extends AbstractPlayer {
//     private Random random;
//     private ConsoleUi consoleUi;

//     public AiPlayer(String name, int initialFunds, ConsoleUi consoleUi) {
//         super(name, initialFunds);
//         random = new Random();
//         this.consoleUi = consoleUi;
//     }

//     @Override
//     public boolean yourTurn(Dice d1, Dice d2) {
//         int action = random.nextInt(3);
//         switch (action) {
//             case 0:
//                 consoleUi.playerBuysProperty(getName(), "Random Property");
//                 return false;
//             case 1:
//                 consoleUi.playerPaysRentFor(getName(), "Random Property", 100);
//                 return false;
//             case 2:
//                 int roll1 = d1.roll();
//                 int roll2 = d2.roll();
//                 consoleUi.playerMoves(getName(), roll1, roll2);
//                 return true;
//             default:
//                 return false;
//         }
//     }
// }