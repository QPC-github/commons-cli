/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.cli;

/**
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public class BasicParserTest extends ParserTestCase
{
    public void setUp()
    {
        super.setUp();
        parser = new BasicParser();
    }

    public void testPropertiesOption() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testShortWithEqual() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testShortWithoutEqual() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testLongWithEqualDoubleDash() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testLongWithEqualSingleDash() throws Exception
    {
        // not supported by the BasicParser
    }
    
    public void testUnambiguousPartialLongOption1() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testUnambiguousPartialLongOption2() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testUnambiguousPartialLongOption3() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testUnambiguousPartialLongOption4() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testAmbiguousPartialLongOption1() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testAmbiguousPartialLongOption2() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testAmbiguousPartialLongOption3() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testAmbiguousPartialLongOption4() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testPartialLongOptionSingleDash() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testBursting() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testUnrecognizedOptionWithBursting() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testMissingArgWithBursting() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testStopBursting() throws Exception
    {
        // not supported by the BasicParser
    }

    public void testStopBursting2() throws Exception
    {
        // not supported by the BasicParser
    }
}