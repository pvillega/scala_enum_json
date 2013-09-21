# Enums and JSON in Scala

This project is a sample on how to serialize Scala enums from/into JSON when using the Play 2.1 JSON libraries

Play JSON libraries facilitate converting *case classes* to JSON by using macros, but this doesn't work with enums. 
Enums require some additional code which is shown in this sample.

# Execution

This is a *sbt* project, you can use the commands *sbt test* to run the unit tests or *sbt run* to run a sample *Main* process

# Dependencies

The following libraries are used in the project:

* [ScalaTest](http://www.scalatest.org/) for Unit Testing
* [Play-JSON](https://github.com/mandubian/play-json-alone) to provide Play JSON tools
* [SBT-idea](https://github.com/mpeltonen/sbt-idea) plugin to generate IDEA files for the project

# License

The MIT License (MIT)

Copyright (c) 2013 Pere Villega

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.



