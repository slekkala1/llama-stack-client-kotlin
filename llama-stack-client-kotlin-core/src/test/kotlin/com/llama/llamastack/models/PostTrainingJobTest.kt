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

internal class PostTrainingJobTest {

    @Test
    fun create() {
        val postTrainingJob = PostTrainingJob.builder().jobUuid("job_uuid").build()

        assertThat(postTrainingJob.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTrainingJob = PostTrainingJob.builder().jobUuid("job_uuid").build()

        val roundtrippedPostTrainingJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postTrainingJob),
                jacksonTypeRef<PostTrainingJob>(),
            )

        assertThat(roundtrippedPostTrainingJob).isEqualTo(postTrainingJob)
    }
}
