/*
* Copyright (C) 2010 ECOSUR, Andrew Waterman and Max Pimm
*
* Licensed under the Academic Free License v. 3.0.
* http://www.opensource.org/licenses/afl-3.0.php
*/


/**
 * Basic enum for relevent GameEvents as used in our prototype.
 * 
 * @author awaterma@ecosur.mx
 *
 */

package mx.ecosur.multigame.enums;

public enum GameEvent implements Event {
    CREATE, BEGIN, PLAYER_CHANGE, PLAYER_JOIN, MOVE_COMPLETE, CONDITION_RAISED, CONDITION_RESOLVED, CONDITION_TRIGGERED,
    STATE_CHANGE, GAME_CHANGE, CHAT, SUGGESTION_APPLIED, SUGGESTION_EVALUATED, EXPIRED, END, DESTROY;
}
