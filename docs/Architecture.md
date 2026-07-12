<div align="center">

# NitroCore - Architecture

</div>

---

## Why NitroCore architecture?

- This document explains how NitroCore is internally organized and how each module interacts with the others.
---

## Introduction

- NitroCore follows a modular architecture allowing players to decide how aggressively optimizations should affect the client while preserving the original gameplay experience.
Every module must have a single
responsibility
- OptimizationManager is the central coordinator of NitroCore.
- Every optimization request flows through the OptimizationManager before reaching the appropriate optimization module. Mixins 
delegate optimization requests to the OptimizationManager, which routes them to the appropriate optimization module.
- Every optimization module must be registered before it can be used.
- Mixins are responsible only for intercepting Minecraft behavior and delegating decisions to NitroCore.
They should never contain optimization logic.

---

# Project Structure

```
NitroCore
├── config
├── logging
├── mixin
├── optimization
├── util
```
### Each package has a single responsibility:

### `/config`

- Responsible for loading, validating and exposing NitroCore configuration.

### `/logging`
- Provides centralized logging for NitroCore.

### `/mixin`

- Responsible for intercepting Minecraft behavior and forwarding optimization requests to NitroCore.

### `/optimization`

- Contains every optimization module and the OptimizationManager, which coordinates them.

### `/util`

- Contains utility classes shared across the project.
---

## Data Flow

> Minecraft
> 
> ↓
> 
> MixinEffectRenderer
> 
> ↓
> 
> OptimizationManager
> 
> ↓
> 
> ParticleOptimization
> 
> ↓
> 
> NitroConfig
> 
> ↓
> 
> Optimization Decision
> 
> ↓
> 
> Minecraft

---

## Module Responsibilities

### Mixin

- Intercept Minecraft methods and delegate decisions.

---

### OptimizationManager

- Coordinate optimization modules and route optimization requests.
---

### All Optimizations (Particle, Chunk, etc)

- Apply optimization rules and return decisions.

---

### ConfigManager

- Load, validate and expose user configuration.

---

### Logger

- Provides centralized logging for NitroCore.

---

> **Architecture exists to make NitroCore easier to evolve, easier to maintain and easier to contribute to.**

# Architecture Principles

- Mixins must remain thin.
- Optimizations must be measurable.
- Every module must have a single responsibility.
- Configuration must be loaded once.
- No optimization may modify server logic.
- Managers coordinate.
- Modules decide.
- Mixins intercept.

---

<div align="center">

# NitroCore

### ⚡ Performance Without Compromise.

Built with ❤️ by **KauanJPK**

© 2026 KauanJPK

</div>
