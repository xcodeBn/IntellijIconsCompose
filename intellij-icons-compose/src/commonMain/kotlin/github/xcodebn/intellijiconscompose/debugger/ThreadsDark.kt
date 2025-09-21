package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThreadsDark: ImageVector
    get() {
        if (_ThreadsDark != null) return _ThreadsDark!!

        _ThreadsDark = ImageVector.Builder(
            name = "ThreadsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 11f)
                lineTo(14f, 11f)
                lineTo(12f, 13f)
                lineTo(4f, 13f)
                close()
            }
        }.build()

        return _ThreadsDark!!
    }

private var _ThreadsDark: ImageVector? = null

