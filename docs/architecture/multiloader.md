# Multi-Loader Architecture

`Learning with Minecraft` should keep shared logic separated from loader-specific integration so the same core can be reused on Fabric and Forge.

## Goal

- keep sentence analysis in shared code
- keep dictionary parsing in shared code
- keep storage and learning data in shared code
- isolate Fabric-specific and Forge-specific bootstrapping

## Recommended structure

```text
src/
├─ common/
│  └─ java/com/learningwithminecraft/
│     ├─ correction/
│     ├─ dictionary/
│     ├─ storage/
│     ├─ ui/
│     └─ util/
├─ fabric/
│  └─ java/com/learningwithminecraft/fabric/
└─ forge/
   └─ java/com/learningwithminecraft/forge/
```

## What goes where

### Common code

Shared logic that does not depend on Fabric or Forge APIs:

- dictionary parsing
- correction rules
- learned word storage
- language models and metadata
- shared UI state and configuration models

### Fabric layer

Fabric-specific startup, event hooks, and screen registration.

### Forge layer

Forge-specific startup, event hooks, and screen registration.

## Why this matters

This structure makes the mod easier to maintain and ports easier to manage when supporting multiple Minecraft versions or loaders.

