package github.xcodebn.intellijiconscompose.scope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scratches: ImageVector
    get() {
        if (_Scratches != null) return _Scratches!!

        _Scratches = ImageVector.Builder(
            name = "Scratches",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(11f, 5f)
                curveTo(7.86f, 4.70f, 5.26f, 7.00f, 4.78f, 10.00f)
                lineTo(1f, 10f)
                lineTo(1f, 1f)
                lineTo(11f, 1f)
                lineTo(11f, 5f)
                close()
                moveTo(5f, 4f)
                lineTo(3f, 2f)
                lineTo(2f, 3f)
                lineTo(4f, 5f)
                lineTo(2f, 7f)
                lineTo(3f, 8f)
                lineTo(5f, 6f)
                lineTo(5f, 6f)
                lineTo(6f, 5f)
                lineTo(6f, 5f)
                lineTo(6f, 5f)
                lineTo(5f, 4f)
                lineTo(5f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(12f, 11f)
                lineTo(12f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 11f)
                lineTo(11f, 11f)
                lineTo(10f, 11f)
                lineTo(12f, 13f)
                lineTo(13f, 13f)
                lineTo(12f, 11f)
                close()
                moveTo(11f, 16f)
                curveTo(8.24f, 16.00f, 6.00f, 13.76f, 6.00f, 11.00f)
                curveTo(6.00f, 8.24f, 8.24f, 6.00f, 11.00f, 6.00f)
                curveTo(13.76f, 6.00f, 16.00f, 8.24f, 16.00f, 11.00f)
                curveTo(16.00f, 13.76f, 13.76f, 16.00f, 11.00f, 16.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(11f, 5f)
                    curveTo(7.86f, 4.70f, 5.26f, 7.00f, 4.78f, 10.00f)
                    lineTo(1f, 10f)
                    lineTo(1f, 1f)
                    lineTo(11f, 1f)
                    lineTo(11f, 5f)
                    close()
                    moveTo(5f, 4f)
                    lineTo(3f, 2f)
                    lineTo(2f, 3f)
                    lineTo(4f, 5f)
                    lineTo(2f, 7f)
                    lineTo(3f, 8f)
                    lineTo(5f, 6f)
                    lineTo(5f, 6f)
                    lineTo(6f, 5f)
                    lineTo(6f, 5f)
                    lineTo(6f, 5f)
                    lineTo(5f, 4f)
                    lineTo(5f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(12f, 11f)
                    lineTo(12f, 8f)
                    lineTo(10f, 8f)
                    lineTo(10f, 11f)
                    lineTo(11f, 11f)
                    lineTo(10f, 11f)
                    lineTo(12f, 13f)
                    lineTo(13f, 13f)
                    lineTo(12f, 11f)
                    close()
                    moveTo(11f, 16f)
                    curveTo(8.24f, 16.00f, 6.00f, 13.76f, 6.00f, 11.00f)
                    curveTo(6.00f, 8.24f, 8.24f, 6.00f, 11.00f, 6.00f)
                    curveTo(13.76f, 6.00f, 16.00f, 8.24f, 16.00f, 11.00f)
                    curveTo(16.00f, 13.76f, 13.76f, 16.00f, 11.00f, 16.00f)
                    close()
                }
            }
        }.build()

        return _Scratches!!
    }

private var _Scratches: ImageVector? = null

