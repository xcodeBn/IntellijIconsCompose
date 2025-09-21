package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Revert: ImageVector
    get() {
        if (_Revert != null) return _Revert!!

        _Revert = ImageVector.Builder(
            name = "Revert",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4f)
                lineTo(4f, 6f)
                lineTo(4f, 7f)
                lineTo(0f, 4f)
                lineTo(4f, 0f)
                lineTo(4f, 1f)
                lineTo(1f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 7f)
                lineTo(7f, 7f)
                curveTo(8.66f, 7.00f, 10.00f, 5.66f, 10.00f, 4.00f)
                curveTo(10.00f, 2.34f, 8.66f, 1.00f, 7.00f, 1.00f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                lineTo(7f, 0f)
                curveTo(9.21f, -0.00f, 11.00f, 1.79f, 11.00f, 4.00f)
                curveTo(11.00f, 6.21f, 9.21f, 8.00f, 7.00f, 8.00f)
                lineTo(4f, 8f)
                lineTo(4f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1f, 4f)
                    lineTo(4f, 6f)
                    lineTo(4f, 7f)
                    lineTo(0f, 4f)
                    lineTo(4f, 0f)
                    lineTo(4f, 1f)
                    lineTo(1f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 7f)
                    lineTo(7f, 7f)
                    curveTo(8.66f, 7.00f, 10.00f, 5.66f, 10.00f, 4.00f)
                    curveTo(10.00f, 2.34f, 8.66f, 1.00f, 7.00f, 1.00f)
                    lineTo(0f, 1f)
                    lineTo(0f, 0f)
                    lineTo(7f, 0f)
                    curveTo(9.21f, -0.00f, 11.00f, 1.79f, 11.00f, 4.00f)
                    curveTo(11.00f, 6.21f, 9.21f, 8.00f, 7.00f, 8.00f)
                    lineTo(4f, 8f)
                    lineTo(4f, 7f)
                    close()
                }
            }
        }.build()

        return _Revert!!
    }

private var _Revert: ImageVector? = null

