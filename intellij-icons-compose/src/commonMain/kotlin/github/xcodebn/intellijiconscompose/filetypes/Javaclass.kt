package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Javaclass: ImageVector
    get() {
        if (_Javaclass != null) return _Javaclass!!

        _Javaclass = ImageVector.Builder(
            name = "Javaclass",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(2f, 1f)
                curveTo(1.29f, 1.00f, 1.00f, 1.54f, 1.00f, 2.50f)
                curveTo(1.00f, 3.46f, 1.28f, 4.00f, 2.00f, 4.00f)
                curveTo(2.71f, 4.00f, 3.00f, 3.45f, 3.00f, 2.50f)
                curveTo(3.00f, 1.55f, 2.71f, 1.00f, 2.00f, 1.00f)
                close()
                moveTo(2f, -0f)
                curveTo(3.21f, -0.00f, 4.00f, 1.12f, 4.00f, 2.50f)
                curveTo(4.00f, 3.88f, 3.21f, 5.00f, 2.00f, 5.00f)
                curveTo(0.79f, 5.00f, 0.00f, 3.88f, 0.00f, 2.50f)
                curveTo(0.00f, 0.96f, 0.79f, -0.00f, 2.00f, -0.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(1f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(1f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(1f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 0f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(2f, 1f)
                    curveTo(1.29f, 1.00f, 1.00f, 1.54f, 1.00f, 2.50f)
                    curveTo(1.00f, 3.46f, 1.28f, 4.00f, 2.00f, 4.00f)
                    curveTo(2.71f, 4.00f, 3.00f, 3.45f, 3.00f, 2.50f)
                    curveTo(3.00f, 1.55f, 2.71f, 1.00f, 2.00f, 1.00f)
                    close()
                    moveTo(2f, -0f)
                    curveTo(3.21f, -0.00f, 4.00f, 1.12f, 4.00f, 2.50f)
                    curveTo(4.00f, 3.88f, 3.21f, 5.00f, 2.00f, 5.00f)
                    curveTo(0.79f, 5.00f, 0.00f, 3.88f, 0.00f, 2.50f)
                    curveTo(0.00f, 0.96f, 0.79f, -0.00f, 2.00f, -0.00f)
                    close()
                }
            }
        }.build()

        return _Javaclass!!
    }

private var _Javaclass: ImageVector? = null

