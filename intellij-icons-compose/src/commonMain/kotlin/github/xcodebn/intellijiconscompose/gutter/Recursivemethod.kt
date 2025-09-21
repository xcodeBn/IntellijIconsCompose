package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Recursivemethod: ImageVector
    get() {
        if (_Recursivemethod != null) return _Recursivemethod!!

        _Recursivemethod = ImageVector.Builder(
            name = "Recursivemethod",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 1f)
                lineTo(5f, 2f)
                curveTo(3.27f, 2.57f, 2.00f, 4.14f, 2.00f, 6.00f)
                curveTo(2.00f, 8.21f, 3.79f, 10.00f, 6.00f, 10.00f)
                curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                curveTo(10.00f, 4.52f, 9.20f, 3.23f, 8.00f, 2.54f)
                lineTo(8f, 1f)
                curveTo(9.77f, 2.19f, 11.00f, 3.95f, 11.00f, 6.00f)
                curveTo(11.00f, 8.76f, 8.76f, 11.00f, 6.00f, 11.00f)
                curveTo(3.24f, 11.00f, 1.00f, 8.76f, 1.00f, 6.00f)
                curveTo(1.00f, 3.58f, 2.72f, 1.56f, 5.00f, 1.10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(7f, 1f)
                lineTo(11f, 1f)
                lineTo(7f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(5f, 1f)
                    lineTo(5f, 2f)
                    curveTo(3.27f, 2.57f, 2.00f, 4.14f, 2.00f, 6.00f)
                    curveTo(2.00f, 8.21f, 3.79f, 10.00f, 6.00f, 10.00f)
                    curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                    curveTo(10.00f, 4.52f, 9.20f, 3.23f, 8.00f, 2.54f)
                    lineTo(8f, 1f)
                    curveTo(9.77f, 2.19f, 11.00f, 3.95f, 11.00f, 6.00f)
                    curveTo(11.00f, 8.76f, 8.76f, 11.00f, 6.00f, 11.00f)
                    curveTo(3.24f, 11.00f, 1.00f, 8.76f, 1.00f, 6.00f)
                    curveTo(1.00f, 3.58f, 2.72f, 1.56f, 5.00f, 1.10f)
                    close()
                }
            }
        }.build()

        return _Recursivemethod!!
    }

private var _Recursivemethod: ImageVector? = null

