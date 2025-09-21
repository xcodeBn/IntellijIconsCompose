package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Guttercheckboxselected: ImageVector
    get() {
        if (_Guttercheckboxselected != null) return _Guttercheckboxselected!!

        _Guttercheckboxselected = ImageVector.Builder(
            name = "Guttercheckboxselected",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 0f)
                lineTo(9f, 0f)
                curveTo(10.66f, -0.00f, 12.00f, 1.34f, 12.00f, 3.00f)
                lineTo(12f, 9f)
                curveTo(12.00f, 10.66f, 10.66f, 12.00f, 9.00f, 12.00f)
                lineTo(3f, 12f)
                curveTo(1.34f, 12.00f, 0.00f, 10.66f, 0.00f, 9.00f)
                lineTo(0f, 3f)
                curveTo(-0.00f, 1.34f, 1.34f, 0.00f, 3.00f, 0.00f)
                close()
                moveTo(3f, 1f)
                curveTo(1.90f, 1.00f, 1.00f, 1.90f, 1.00f, 3.00f)
                lineTo(1f, 9f)
                curveTo(1.00f, 10.10f, 1.90f, 11.00f, 3.00f, 11.00f)
                lineTo(9f, 11f)
                curveTo(10.10f, 11.00f, 11.00f, 10.10f, 11.00f, 9.00f)
                lineTo(11f, 3f)
                curveTo(11.00f, 1.90f, 10.10f, 1.00f, 9.00f, 1.00f)
                lineTo(3f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(3f, 0f)
                    lineTo(9f, 0f)
                    curveTo(10.66f, -0.00f, 12.00f, 1.34f, 12.00f, 3.00f)
                    lineTo(12f, 9f)
                    curveTo(12.00f, 10.66f, 10.66f, 12.00f, 9.00f, 12.00f)
                    lineTo(3f, 12f)
                    curveTo(1.34f, 12.00f, 0.00f, 10.66f, 0.00f, 9.00f)
                    lineTo(0f, 3f)
                    curveTo(-0.00f, 1.34f, 1.34f, 0.00f, 3.00f, 0.00f)
                    close()
                    moveTo(3f, 1f)
                    curveTo(1.90f, 1.00f, 1.00f, 1.90f, 1.00f, 3.00f)
                    lineTo(1f, 9f)
                    curveTo(1.00f, 10.10f, 1.90f, 11.00f, 3.00f, 11.00f)
                    lineTo(9f, 11f)
                    curveTo(10.10f, 11.00f, 11.00f, 10.10f, 11.00f, 9.00f)
                    lineTo(11f, 3f)
                    curveTo(11.00f, 1.90f, 10.10f, 1.00f, 9.00f, 1.00f)
                    lineTo(3f, 1f)
                    close()
                }
            }
        }.build()

        return _Guttercheckboxselected!!
    }

private var _Guttercheckboxselected: ImageVector? = null

