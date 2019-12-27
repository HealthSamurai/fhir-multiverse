# Table of Contents

1.  [FHIR multiverse](#orga24b827)
    1.  [Implementation steps](#org2ceff12)
        1.  [Sample data generation and testing](#org7769808)
        2.  [Diff fhir r3 to r4 data](#org09749cd)
        3.  [Implement converters](#orgc583f85)
        4.  [Implement simple CRUD](#org9541d62)
        5.  [Think about search generation for r5](#org400483b)
    2.  [Useful links](#org0054e25)


<a id="orga24b827"></a>

# FHIR multiverse

Get all fhir version universes at once


<a id="org2ceff12"></a>

## Implementation steps


<a id="org7769808"></a>

### Sample data generation and testing

1.  Generate or write connected sample data
2.  Define testing criteria
3.  Implement data generator
4.  Implement data validator

Artifacts: testing criteria, sample data, data generator


<a id="org09749cd"></a>

### Diff fhir r3 to r4 data

1.  Check [useful links](#org0054e25)
2.  Generate diff from metadata
3.  Highlight differences not described in useful links or generated diffs

Artifacts: edn/json diff, description of other differences


<a id="orgc583f85"></a>

### Implement converters

1.  Generate ironhide converters from diff
2.  Test convertation quality using [testing criteria](#org7769808)

Artifacts: r3<->r4 converter


<a id="org9541d62"></a>

### Implement simple CRUD

1.  /r3 /r4 endpoints or fhirVersion header?

Keep in mind that behaviour of CRUD operations also differs for
different fhir versions

2.  Implement r4 resource storage
3.  Implement GET/PUT

Artfiacts: http-server+db


<a id="org400483b"></a>

### Think about search generation for r5

How to migrate search implementation from r3 to r4 to r5?

Artifacts: draft search implementation, migration guide


<a id="org0054e25"></a>

## Useful links

* <http://hl7.org/fhir/diff.html>
* <http://hl7.org/fhir/r3maps.html>
* <http://hl7.org/fhir/patient-version-maps.html>



## Dev

```
make up
make repl

> cider-connect

(multiverse.core/-main)
or run code at the bottom of multiverse.core

OPEN http://localhost:8887/?_format=edn
OPEN http://localhost:8887/?_format=yaml
OPEN http://localhost:8887/

OPEN http://localhost:8887/r4/Patient
OPEN http://localhost:8887/r3/Patient

```
