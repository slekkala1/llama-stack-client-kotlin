// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

interface SyntheticDataGenerationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SyntheticDataGenerationService

    fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SyntheticDataGenerationResponse

    /**
     * A view of [SyntheticDataGenerationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SyntheticDataGenerationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/synthetic-data-generation/generate`, but is
         * otherwise the same as [SyntheticDataGenerationService.generate].
         */
        @MustBeClosed
        fun generate(
            params: SyntheticDataGenerationGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SyntheticDataGenerationResponse>
    }
}
