# Learning with Minecraft

`Learning with Minecraft` is a Minecraft PC mod concept focused on language correction and suggestions directly in the in-game chat.

## Main idea

The mod analyzes what the player types in chat and helps them learn the language they are studying. The goal is to work as an offline corrector and suggestion tool, without any external API.

The concept is simple:

- the player downloads two dictionaries
- one dictionary is for the player's native language
- the other dictionary is for the language they want to learn
- the player places both files inside the mod folder
- the mod reads these files locally
- the mod identifies errors in the typed sentence
- the mod suggests corrections
- the mod explains the mistake in the player's native language
- the player can save new words in a learning panel

The setup window opens inside Minecraft, through an extra entry in the game settings called `Learn Idioms`.

## Example

If a Portuguese-speaking player is learning English, the mod could work like this:

- typed sentence: `I have 20 years`
- suggested correction: `I am 20 years old`
- explanation in Portuguese: in English, age is usually expressed with `to be`, not `have`

This makes the learning process easier because the player receives the explanation in a language they already understand.

## Planned features

### 1. Chat sentence correction

The mod detects common grammar, vocabulary, and sentence structure mistakes before or right after the message is sent in chat, based on the local dictionaries.

### 2. Explanations in the player's native language

Players learn better when the analysis is shown in the language they already know. For example, a Brazilian player learning English would see the explanation in Portuguese.

### 3. Local dictionaries

The mod depends on two dictionaries provided by the user:

- native language dictionary
- target language dictionary

These files live in the mod folder and are used as the base for comparison, suggestion, and explanation.

### 4. In-game setup entry

The mod adds a dedicated settings entry inside Minecraft called `Learn Idioms`.

From there, the player can open the configuration window, choose the native language, choose the target language, and manage the local dictionaries.

### 5. Learned words panel

The player can open a panel with the history of words and expressions they have learned.

This panel can show:

- original word
- translation
- usage example
- context where it appeared
- date learned
- review status

### 6. Progress tracking

The mod can remember what the player has already seen so it does not repeat the same content all the time and can support future reviews.

## Learning structure

The idea can be organized into four parts:

1. `Real-time correction`
   - analyzes typed sentences
   - suggests corrections
   - shows short explanations

2. `Local dictionaries`
   - reads the native dictionary
   - reads the target language dictionary
   - uses both to compare and suggest corrections

3. `Learning history`
   - saves new words and structures
   - avoids duplicate entries
   - connects learning to chat context

4. `Player panel`
   - lists learned words
   - allows vocabulary review
   - helps track progress

5. `Minecraft settings entry`
   - exposes the mod inside the game settings
   - opens the setup window in-game
   - keeps the first-run flow accessible without leaving Minecraft

## Goal of the mod

The goal of `Learning with Minecraft` is to turn the chat into a lightweight, practical, and contextual study environment without taking the player away from the game.

It would not be just a corrector. The idea is to work as a discreet corrector and suggestion tool that teaches while the player plays.

## Next steps

When the project is developed, the next steps could be:

- decide the base Minecraft version
- choose the mod technology
- define the local dictionary format
- design the word panel interface
- structure the correction and explanation flow in chat

## Project structure

The repository is organized to keep the mod maintainable and ready for future updates:

```text
learning-with-minecraft/
├─ src/
│  ├─ common/java/com/learningwithminecraft/   # shared logic
│  ├─ fabric/java/com/learningwithminecraft/    # Fabric-only integration
│  ├─ forge/java/com/learningwithminecraft/     # Forge-only integration
│  └─ main/resources/
│     ├─ assets/learningwithminecraft/lang/     # translation files
│     ├─ config/                                # bundled config templates
│     └─ dictionaries/                          # local dictionary assets and samples
├─ docs/
│  ├─ architecture/    # technical design notes
│  ├─ formats/         # dictionary and file format specs
│  └─ roadmap/         # feature planning
├─ examples/           # sample files and usage examples
├─ scripts/            # maintenance scripts
└─ test-data/          # test dictionaries and fixtures
```

The project is being prepared as a multi-loader codebase, so the shared logic stays in one place and Fabric/Forge only handle platform-specific startup and UI hooks.

The practical target is a shared core with separate loader integrations, not a single universal jar for every Minecraft release.

## Summary

`Learning with Minecraft` is a language-learning mod where the in-game chat becomes an educational tool. It corrects sentences, suggests alternatives, explains mistakes in the player's native language, and keeps a panel with learned words for future review, all powered by local dictionaries provided by the user.
