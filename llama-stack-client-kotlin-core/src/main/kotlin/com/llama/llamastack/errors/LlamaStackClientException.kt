// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

package com.llama.llamastack.errors

open class LlamaStackClientException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
