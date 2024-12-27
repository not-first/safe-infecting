# Safe Infecting
_Infect villagers without them dying, 100% of the time, on any difficulty._

In vanilla minecraft, villagers have a chance of dying when being killed by a zombie, instead of being infected. Only on hard difficulty is villager infection guaranteed.
This can be heavily inconvenient for players who simply wish for guaranteed infection without wanting to play on hard difficulty constantly.

This lightweight mod guarantees villager infection on any difficulty, removing the chance of death.

Supports 1.21.x minecraft versions. The mod only has to be installed on the server.

### Technical Description
The mod uses fabric mixins, to edit the Zombie entity class.
When a zombie kills a villager, the onKilledOther zombie method is triggered, which makes a call to check the world difficulty.
The mod simply replaces this call with a method that returns the difficulty hard.
This tricks the game into believing villagers should have a 100% conversiion rate, despite the rest of the world operating on a different difficulty.
