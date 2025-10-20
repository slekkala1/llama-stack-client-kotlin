// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionInfoTest {

    @Test
    fun create() {
        val versionInfo = VersionInfo.builder().version("version").build()

        assertThat(versionInfo.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionInfo = VersionInfo.builder().version("version").build()

        val roundtrippedVersionInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionInfo),
                jacksonTypeRef<VersionInfo>(),
            )

        assertThat(roundtrippedVersionInfo).isEqualTo(versionInfo)
    }
}
