package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EditsourceDark: ImageVector
    get() {
        if (_EditsourceDark != null) return _EditsourceDark!!

        _EditsourceDark = ImageVector.Builder(
            name = "EditsourceDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                lineTo(8f, 2f)
                lineTo(2f, 9f)
                lineTo(2f, 11f)
                lineTo(4f, 11f)
                lineTo(11f, 5f)
                close()
                moveTo(13f, 3f)
                curveTo(12.91f, 2.63f, 12.91f, 1.92f, 12.65f, 1.65f)
                lineTo(11f, 0f)
                curveTo(11.13f, 0.13f, 10.42f, 0.13f, 10.15f, 0.40f)
                lineTo(9f, 2f)
                lineTo(11f, 4f)
                lineTo(13f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 5f)
                    lineTo(8f, 2f)
                    lineTo(2f, 9f)
                    lineTo(2f, 11f)
                    lineTo(4f, 11f)
                    lineTo(11f, 5f)
                    close()
                    moveTo(13f, 3f)
                    curveTo(12.91f, 2.63f, 12.91f, 1.92f, 12.65f, 1.65f)
                    lineTo(11f, 0f)
                    curveTo(11.13f, 0.13f, 10.42f, 0.13f, 10.15f, 0.40f)
                    lineTo(9f, 2f)
                    lineTo(11f, 4f)
                    lineTo(13f, 3f)
                    close()
                }
            }
        }.build()

        return _EditsourceDark!!
    }

private var _EditsourceDark: ImageVector? = null

