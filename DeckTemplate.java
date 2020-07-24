public class Deck {

   // private instance data;
   private Card[] cards;

   // public constructor:
   public Deck() {
      this.cards = new Card[52];
      int i = 0;
      for ( int suit = Card.SPADES; suit <= Card.CLUBS; suit++ ) {
         for ( int rank = Card.ACE; rank <= Card.KING; rank++ ) {
            this.cards[i] = new Card(rank,suit);
            i++;
         }
      }
   }

   /** Returns a copy of the card at the specified index in this deck. */
   public Card cardAt(int index) {
      if ( index < 0 | index > 51 ) {
         throw new IllegalArgumentException();
      } else {
         return new Card( this.cards[index].getRank(),this.cards[index].getSuit() );
      }
   }

   /** Shuffles this deck. */
   public void shuffle() {
      // Replace the next instruction with your code:
      throw new UnsupportedOperationException();
   }

   /** Returns a stringy version of this deck. */
   public String toString() {
      // Replace the next instruction with your code:
      throw new UnsupportedOperationException();
   }

   /** Test program for this class. */
   public static void main ( String[] args ) {
      // You do this part!
   }
}
