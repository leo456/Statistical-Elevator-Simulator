/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponn;

/**
 *
 * @author Suleman
 */
public class db {
    
    public enum State{fr,se,th,fo,fif};
	private State state;
        int flr;
//	private double[][] transitionProbability={ 
//		{ 0, 0.25, 0.25,0.25,0.25 }, 
//		{ 0.7, 0, 0.1 ,0.1 ,0.1 },
//                {  0.7 ,0.1 ,0, 0.1, 0.1 },
//                {  0.7, 0.1, 0.1 ,0, 0.1 },
//                {  0.7, 0.1 ,0.1, 0.1 ,0 }};
		

//		public db() 
//		{ 
//			super();
//		state = State.fr; }

                public  db (int flr) {
      //  super();

        switch (flr) {
            case 1:
               state = State.fr;
                break; // optional

            case 2:
                // Statements
               state =  State.se;
                break; // optional

            case 3:
                // Statements
                state =  State.th;
                break; // optional

            case 4:
                // Statements
                state =  State.fo;
                break; // optional

            case 5:
                // Statements
                state =   State.fif;
                break; // optional

            default: // Optional
            // Statements
        }
    
                }


	public void update() {
	
	double rand = Math.random();
	         //  System.out.println("rand"+rand);
    //  state = df(flr);
                 
//                 if(flr ==1)
//      {
//                    state = State.fr;
          if (state == State.fr) {
              if (rand <= 0) {
                  state = state.fr;
                  flr = 1;
                  System.out.println("STATE 1");
              } else if (rand < .25) {
                  state = state.se;
                  flr = 2;
              } else if (rand < .5) {
                  state = state.th;
                  flr = 3;
              } else if (rand < .75) {
                  state = state.fo;
                  flr = 4;
              } else {
                  state = state.fif;
                  flr = 5;
              }

              //se
          }
      //}
      
//                    state = State.se;
        else  if (state == State.se) {
              if (rand <= 0) {
                  state = state.se;
                  flr = 2;
              } else if (rand < .7) {
                  state = state.fr;
                  flr = 1;
                  System.out.println("STATE 1");
              } else if (rand < .8) {
                  state = state.th;
                  flr = 3;
              } else if (rand < .9) {
                  state = state.fo;
                  flr = 4;
              } else {
                  state = state.fif;
                  flr = 5;
              }

              //th
          }
      
//      else if(flr ==3)
//      {          state = State.th;
        else if (state == State.th) {
               if (rand <= 0) {
                  state = state.th;
                  flr = 3;
              } else if (rand < 0.7) {
                  state = state.fr;
                  flr = 1;
                  System.out.println("STATE 1");
              } else if (rand < .8) {
                  state = state.se;
                  flr = 2;
              } else if (rand < .9) {
                  state = state.fo;
                  flr = 4;
              } else {
                  state = state.fif;
                  flr = 5;
              }
          }
//      }
//        //fo
//      else if(flr == 4)
//      {
//                    state = State.fo;
        else if (state == State.fo) {
              if (rand <= 0) {
                  state = state.fo;
                  flr = 4;
              } else if (rand < 0.7) {
                  state = state.fr;
                  flr = 1;
                  System.out.println("STATE 1");
              } else if (rand < .8) {
                  state = state.se;
                  flr = 2;
              } else if (rand < .9) {
                  state = state.th;
                  flr = 3;
              } else {
                  state = state.fif;
                  flr = 5;
              }
          }
//      }
//        //fif
//      else if(flr == 5)
//      {          state = State.fif;
        else if (state == State.fif) {
              if (rand <= 0) {
                  state = state.fif;
                  flr = 5;
              } else if (rand < 0.7) {
                  state = state.fr;
                  flr = 1;
                  System.out.println("STATE 1");
              } else if (rand < .8) {
                  state = state.se;
                  flr = 2;
              } else if (rand < .9) {
                  state = state.th;
                  flr = 3;
              } else {
                  state = state.fo;
                  flr = 4;
              }
          
        }
//      }
        
        /*if (random < transitionProbability[state.ordinal()][State.fr.ordinal()]) {
                state = State.fr;
            } else if (random < transitionProbability[state.ordinal()][State.fr.ordinal()]
                                + transitionProbability[state.ordinal()][State.se.ordinal()]) {
                state = State.ESRD;
            } else {
                state = State.D;
            }
*/
	
}
        
        public int getflr()
        {
            return flr;
        }
	public State output() 
	{
		return state; 
     }

    
    
}
