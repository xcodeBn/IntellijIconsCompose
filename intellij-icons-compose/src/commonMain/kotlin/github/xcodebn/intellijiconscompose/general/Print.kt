package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Print: ImageVector
    get() {
        if (_Print != null) return _Print!!

        _Print = ImageVector.Builder(
            name = "Print",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4f)
                lineTo(13f, 4f)
                curveTo(13.48f, 4.00f, 14.00f, 4.45f, 14.00f, 5.00f)
                lineTo(14f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 5f)
                curveTo(0.00f, 4.45f, 0.52f, 4.00f, 1.17f, 4.00f)
                close()
                moveTo(12f, 5f)
                lineTo(12f, 6f)
                lineTo(13f, 6f)
                lineTo(13f, 5f)
                lineTo(12f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 7f)
                close()
                moveTo(4f, 8f)
                lineTo(4f, 12f)
                lineTo(10f, 12f)
                lineTo(10f, 8f)
                lineTo(4f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1f, 4f)
                    lineTo(13f, 4f)
                    curveTo(13.48f, 4.00f, 14.00f, 4.45f, 14.00f, 5.00f)
                    lineTo(14f, 9f)
                    lineTo(0f, 9f)
                    lineTo(0f, 5f)
                    curveTo(0.00f, 4.45f, 0.52f, 4.00f, 1.17f, 4.00f)
                    close()
                    moveTo(12f, 5f)
                    lineTo(12f, 6f)
                    lineTo(13f, 6f)
                    lineTo(13f, 5f)
                    lineTo(12f, 5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3f, 7f)
                    lineTo(11f, 7f)
                    lineTo(11f, 13f)
                    lineTo(3f, 13f)
                    lineTo(3f, 7f)
                    close()
                    moveTo(4f, 8f)
                    lineTo(4f, 12f)
                    lineTo(10f, 12f)
                    lineTo(10f, 8f)
                    lineTo(4f, 8f)
                    close()
                }
            }
        }.build()

        return _Print!!
    }

private var _Print: ImageVector? = null

