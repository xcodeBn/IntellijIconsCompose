package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowchanges: ImageVector
    get() {
        if (_Toolwindowchanges != null) return _Toolwindowchanges!!

        _Toolwindowchanges = ImageVector.Builder(
            name = "Toolwindowchanges",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 1f)
                lineTo(12f, 5f)
                lineTo(6f, 5f)
                close()
            }
        }.build()

        return _Toolwindowchanges!!
    }

private var _Toolwindowchanges: ImageVector? = null

