# NitroCore Vision

NitroCore is not an FPS mod.

NitroCore is a CPU optimization engine designed primarily for Minecraft Forge 1.7.10.

The project focuses on reducing CPU usage rather than simply increasing FPS.

Every optimization must satisfy at least one of the following goals:

- Reduce CPU time.
- Reduce memory allocations.
- Reduce unnecessary rendering.
- Reduce unnecessary game logic.

Rules:

- No unnecessary allocations.
- No reflection in hot paths.
- No per-tick overhead unless strictly necessary.
- Configuration is loaded once and cached.
- Mixins should remain as small as possible.
- Every optimization must be measurable.
