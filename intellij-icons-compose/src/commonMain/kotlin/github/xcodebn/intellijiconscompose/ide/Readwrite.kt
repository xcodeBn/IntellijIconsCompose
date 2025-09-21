package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Readwrite: ImageVector
    get() {
        if (_Readwrite != null) return _Readwrite!!

        _Readwrite = ImageVector.Builder(
            name = "Readwrite",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 4f)
                curveTo(3.17f, 3.50f, 2.50f, 4.12f, 2.50f, 4.89f)
                lineTo(2f, 7f)
                lineTo(6f, 7f)
                lineTo(6f, 5f)
                curveTo(5.50f, 4.12f, 4.83f, 3.50f, 4.00f, 3.50f)
                close()
                moveTo(7f, 7f)
                lineTo(1f, 7f)
                lineTo(1f, 5f)
                curveTo(1.00f, 3.34f, 2.34f, 2.00f, 4.00f, 2.00f)
                curveTo(5.66f, 2.00f, 7.00f, 3.34f, 7.00f, 5.00f)
                lineTo(7f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(4f, 4f)
                    curveTo(3.17f, 3.50f, 2.50f, 4.12f, 2.50f, 4.89f)
                    lineTo(2f, 7f)
                    lineTo(6f, 7f)
                    lineTo(6f, 5f)
                    curveTo(5.50f, 4.12f, 4.83f, 3.50f, 4.00f, 3.50f)
                    close()
                    moveTo(7f, 7f)
                    lineTo(1f, 7f)
                    lineTo(1f, 5f)
                    curveTo(1.00f, 3.34f, 2.34f, 2.00f, 4.00f, 2.00f)
                    curveTo(5.66f, 2.00f, 7.00f, 3.34f, 7.00f, 5.00f)
                    lineTo(7f, 7f)
                    close()
                }
            }
        }.build()

        return _Readwrite!!
    }

private var _Readwrite: ImageVector? = null

