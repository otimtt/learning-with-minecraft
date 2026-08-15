# Dictionary Format

The mod uses local dictionary files placed by the user in the mod folder.

## Purpose

The dictionaries provide the raw data used by the mod to:

- compare native and target language terms
- suggest corrections
- show short explanations
- store vocabulary learned from chat

## Recommended file format

JSON is the recommended format for the first version because it is simple to validate and easy to update.

## Suggested structure

```json
{
  "language": "en-US",
  "nativeLanguage": "pt-BR",
  "version": 1,
  "entries": [
    {
      "term": "although",
      "translation": "embora",
      "partOfSpeech": "conjunction",
      "example": "Although it was raining, we played.",
      "notes": "Used to contrast ideas."
    }
  ]
}
```

## Fields

- `language`: target dictionary language code
- `nativeLanguage`: native dictionary language code
- `version`: dictionary format version
- `entries`: array of dictionary entries

Each entry should contain:

- `term`: the word or expression
- `translation`: translated equivalent
- `partOfSpeech`: optional grammatical category
- `example`: optional usage example
- `notes`: optional learning note or rule

## Storage location

Dictionary files should be placed in the mod's local dictionary folder so the game can load them offline.

