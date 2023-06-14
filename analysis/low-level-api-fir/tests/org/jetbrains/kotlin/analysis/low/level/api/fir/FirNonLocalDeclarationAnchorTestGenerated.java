/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors")
@TestDataPath("$PROJECT_ROOT")
public class FirNonLocalDeclarationAnchorTestGenerated extends AbstractFirNonLocalDeclarationAnchorTest {
    @Test
    public void testAllFilesPresentInNonLocalDeclarationAnchors() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classWithMembers.kt")
    public void testClassWithMembers() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/classWithMembers.kt");
    }

    @Test
    @TestMetadata("localFunctionInsideAnnotationCall.kt")
    public void testLocalFunctionInsideAnnotationCall() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/localFunctionInsideAnnotationCall.kt");
    }

    @Test
    @TestMetadata("localFunctionInsideFunctionLiteral.kt")
    public void testLocalFunctionInsideFunctionLiteral() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/localFunctionInsideFunctionLiteral.kt");
    }

    @Test
    @TestMetadata("localFunctionInsideLambdaCallInsideStringTemplate.kt")
    public void testLocalFunctionInsideLambdaCallInsideStringTemplate() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/localFunctionInsideLambdaCallInsideStringTemplate.kt");
    }

    @Test
    @TestMetadata("localFunctionInsideStringTemplate.kt")
    public void testLocalFunctionInsideStringTemplate() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/localFunctionInsideStringTemplate.kt");
    }

    @Test
    @TestMetadata("localFunctionInsideSuperEntryCall.kt")
    public void testLocalFunctionInsideSuperEntryCall() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/nonLocalDeclarationAnchors/localFunctionInsideSuperEntryCall.kt");
    }
}
