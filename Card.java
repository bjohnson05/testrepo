public class Card {

   // public constants ~ two ways to do this assignment:

   public static final int ACE   = 1;           // you can directly assign values
   public static final int DEUCE = 2;           //   as you can see in this example
   public static final int TWO   = 2;           //   or you can add one to the previous
   public static final int THREE = 3;           //   values as you can see below in
   public static final int FOUR  = 4;           //   assigning the suits
   public static final int FIVE  = 5;
   public static final int SIX   = 6;
   public static final int SEVEN = 7;
   public static final int EIGHT = 8;
   public static final int NINE  = 9;
   public static final int TEN   = 10;
   public static final int JACK  = 11;
   public static final int KNAVE = 11;
   public static final int QUEEN = 12;
   public static final int KING  = 13;

   public static final int SPADES   = 1;
   public static final int HEARTS   = SPADES   + 1;      // HEARTS   gets 2
   public static final int DIAMONDS = HEARTS   + 1;      // DIAMONDS gets 3
   public static final int CLUBS    = DIAMONDS + 1;      // ...and so forth

   // private instance data;

   private int rank;
   private int suit;

   // public constructor:
   public Card ( int rank, int suit ) {
      if ( rank < Card.ACE | rank > Card.KING | suit < Card.SPADES | suit > Card.CLUBS ) {
         throw new IllegalArgumentException();
      } else {
         this.rank = rank;
         this.suit = suit;
      }
   }

   /** Returns this card's suit. */
   public int getSuit() {
      return this.suit;
   }

   /** Returns this card's rank. */
   public int getRank() {
      return this.rank;
   }

   /** Instance method that returns a stringy version of this card. */
   public String toString() {
      String result = "";
      switch ( this.rank ) {
         case ACE   : result = "Ace of ";   break;
         case TWO   : result = "Deuce of "; break;
         case THREE : result = "Three of "; break;
         case FOUR  : result = "Four of ";  break;
         case FIVE  : result = "Five of ";  break;
         case SIX   : result = "Six of ";   break;
         case SEVEN : result = "Seven of "; break;
         case EIGHT : result = "Eight of "; break;
         case NINE  : result = "Nine of ";  break;
         case TEN   : result = "Ten of ";   break;
         case JACK  : result = "Jack of ";  break;
         case QUEEN : result = "Queen of "; break;
         case KING  : result = "King of ";  break;
         default    : throw new UnsupportedOperationException();
      }

      switch ( this.suit ) {
         case SPADES   : result += "Spades";   break;
         case HEARTS   : result += "Hearts";   break;
         case DIAMONDS : result += "Diamonds"; break;
         case CLUBS    : result += "Clubs";    break;
         default : throw new UnsupportedOperationException();
      }
      return result;
   }

   /** Classwide method that returns a stringy version of this card. */
   public static String toString ( Card c ) {
      return c.toString();
   }

   /** Test program for this class. */
   public static void main ( String[] args ) {
      Card c1 = new Card( ACE,   SPADES );
      Card c2 = new Card( KING,  SPADES );
      Card c3 = new Card( QUEEN, SPADES );
      Card c4 = new Card( JACK,  SPADES );
      Card c5 = new Card( TEN,   SPADES );
      System.out.println( "\n  Card c1 is the " + c1.toString() );
      System.out.println( "  Card c2 is the " + c2.toString() );
      System.out.println( "  Card c3 is the " + c3.toString() );
      System.out.println( "  Card c4 is the " + c4.toString() );
      System.out.println( "  Card c5 is the " + c5.toString() );

      c1 = new Card( TWO,   HEARTS );
      c2 = new Card( THREE, HEARTS );
      c3 = new Card( FOUR,  HEARTS );
      c4 = new Card( FIVE,  HEARTS );
      c5 = new Card( SIX,   HEARTS );
      System.out.println( "\n  Card c1 is the " + c1.toString() );
      System.out.println( "  Card c2 is the " + c2.toString() );
      System.out.println( "  Card c3 is the " + c3.toString() );
      System.out.println( "  Card c4 is the " + c4.toString() );
      System.out.println( "  Card c5 is the " + c5.toString() );

      c1 = new Card( SEVEN, CLUBS );
      c2 = new Card( EIGHT, CLUBS );
      c3 = new Card( NINE,  CLUBS );
      c4 = new Card( TEN,   CLUBS );
      c5 = new Card( JACK,  CLUBS );
      System.out.println( "\n  Card c1 is the " + c1.toString() );
      System.out.println( "  Card c2 is the " + c2.toString() );
      System.out.println( "  Card c3 is the " + c3.toString() );
      System.out.println( "  Card c4 is the " + c4.toString() );
      System.out.println( "  Card c5 is the " + c5.toString() );

      c1 = new Card( FOUR,  DIAMONDS );
      c2 = new Card( SIX,   DIAMONDS );
      c3 = new Card( EIGHT, DIAMONDS );
      c4 = new Card( TEN,   DIAMONDS );
      c5 = new Card( TWO,   DIAMONDS );
      System.out.println( "\n  Card c1 is the " + c1.toString() );
      System.out.println( "  Card c2 is the " + c2.toString() );
      System.out.println( "  Card c3 is the " + c3.toString() );
      System.out.println( "  Card c4 is the " + c4.toString() );
      System.out.println( "  Card c5 is the " + c5.toString() );
   }

}
