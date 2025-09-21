package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EditschemeDark: ImageVector
    get() {
        if (_EditschemeDark != null) return _EditschemeDark!!

        _EditschemeDark = ImageVector.Builder(
            name = "EditschemeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(11f, 7f)
                lineTo(8f, 4f)
                lineTo(2f, 11f)
                lineTo(2f, 13f)
                lineTo(4f, 13f)
                lineTo(11f, 7f)
                close()
                moveTo(13f, 5f)
                curveTo(12.91f, 4.63f, 12.91f, 3.92f, 12.65f, 3.65f)
                lineTo(11f, 2f)
                curveTo(11.13f, 2.13f, 10.42f, 2.13f, 10.15f, 2.40f)
                lineTo(9f, 4f)
                lineTo(11f, 6f)
                lineTo(13f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(4f, 0f)
                lineTo(4f, 1f)
                lineTo(1f, 3f)
                lineTo(4f, 5f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(0f, 5f)
                lineTo(3f, 3f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                lineTo(4f, 2f)
                lineTo(4f, 4f)
                lineTo(0f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(11f, 7f)
                    lineTo(8f, 4f)
                    lineTo(2f, 11f)
                    lineTo(2f, 13f)
                    lineTo(4f, 13f)
                    lineTo(11f, 7f)
                    close()
                    moveTo(13f, 5f)
                    curveTo(12.91f, 4.63f, 12.91f, 3.92f, 12.65f, 3.65f)
                    lineTo(11f, 2f)
                    curveTo(11.13f, 2.13f, 10.42f, 2.13f, 10.15f, 2.40f)
                    lineTo(9f, 4f)
                    lineTo(11f, 6f)
                    lineTo(13f, 5f)
                    close()
                }
            }
        }.build()

        return _EditschemeDark!!
    }

private var _EditschemeDark: ImageVector? = null

