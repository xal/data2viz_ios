package org.kotlin.mpp.mobile

import io.data2viz.color.Colors
import io.data2viz.viz.renderingTest

fun rectViz() =
        renderingTest("path.rect") {

            rect {
                x  = 1.0
                y  = 1.0
                width = 200.0
                height = 100.0
                fill = Colors.Web.green
                stroke = Colors.Web.gray
            }

        }