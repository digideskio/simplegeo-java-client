simplegeo-java-client v1.2.4
================================================================================

ABSTRACT:
--------------------------------------------------------------------------------

A thread-safe, Java HttpClient used to interface with the SimpleGeo API. Both
synchronous and asynchronous calls are provided. 

CHANGES FROM PREVIOUS VERSIONS:
--------------------------------------------------------------------------------
Version 1.2.4
- Merged mefogle's fork that refactors the SimpleGeoClient into an interface and
abstract class which allows the client to run within Google App Engine.

Version 1.2.3
- Renamed the LocationService to SimpleGeoClient and placed it under
a different pacakge
- Added a LayerManager that can handle queries for multiple Layer object

Version 1.2.2
- Removed the android project artifacts

Version 1.2.1
- Added access to the Record history endpoint
- Exposed pagination in the nearby and history queries

Version 1.2.0
- Added access to the new PushPin endpoints: contains, overlaps and boundary
- Added access to the new SpotRank endpoint: density

Version 1.1.0
- Fix query parameters for nearby calls

Version 1.0.0
- Nearby requests only accept a single layer instead of multiple.

Version 0.1.1
- Added license

### Copyright (C) 2010 SimpleGeo Inc. All rights reserved.
