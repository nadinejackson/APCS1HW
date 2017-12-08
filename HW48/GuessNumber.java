/*==================================================
  Nadine Jackson
  APCS1 pd2
  HW48 -- Keep Guessing
  2017-12-06

  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) //you shouldn't/can't initialize a game w/o bounds
    {
	_lo = a; //lower bound
	_hi = b; //upper bound
	_guessCtr = 1; //it can't take 0 guesses
	_target = _lo + (int) ((1 + _hi - _lo) * Math.random()); //pick a random int in the range
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	System.out.println("Guess a number between " + _lo + " and " + _hi + " (inclusive)."); //prompt user to guess, give specification
	int guess = Keyboard.readInt(); //set guess to the guess
	if (guess == _target) //you win
	    {
		System.out.println("Correct! It took you " + _guessCtr + " guesses. Darned impressive."); //congrats
	    }
	else
	    {
		if (guess <= _hi && guess >= _lo) //if you actually guessed in the range I done told ya
		    {
			if (_target <  guess) //if too high
			    {
				_hi = guess - 1; //change the range
				System.out.println("Too high, guess again..."); //tell user
			    }
			else //if too low
			    {
				_lo = guess + 1; //move the range down
				System.out.println("Too low, guess again..."); //tell user
			    }
		    }
		_guessCtr += 1; //another failure
		playRec();
		
	    }
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	System.out.println("Guess a number between " + _lo + " and " + _hi + " (inclusive)."); //give the range
	int guess = Keyboard.readInt(); //first guess
	while (guess != _target) //i copied this from the other function and changed the order to make it iterative
	    {
		if (guess <= _hi && guess >= _lo) //if you guessed in the right range
		    {
			if (_target <  guess) //if too high
			    {
				_hi = guess - 1; //new upper bound
				System.out.println("Too high, guess again..."); //warn the user
			    }
			else
			    {
				_lo = guess + 1; //new lower bound
				System.out.println("Too low, guess again..."); //warn user
			    }
		    }
		System.out.println("Guess a number between " + _lo + " and " + _hi + " (inclusive)."); //alert user of new range
		guess = Keyboard.readInt(); //get new guess
		_guessCtr += 1; //recurse
		
	    }
	System.out.println("Correct! It took you " + _guessCtr + " guesses. Darned impressive."); //wow! you won!
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//playRec(); //the easier one
	playIter(); //it finally works
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	
	//instantiate a new game
	GuessNumber g = new GuessNumber(200,300); //also tried other ranges here: (0, 1000) and (200, 300)

	//start the game
	g.play();
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
