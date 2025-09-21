package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showastree: ImageVector
    get() {
        if (_Showastree != null) return _Showastree!!

        _Showastree = ImageVector.Builder(
            name = "Showastree",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(1f, 1f)
                lineTo(4f, 1f)
                lineTo(5f, 2f)
                lineTo(1f, 2f)
                close()
            }
        }.build()

        return _Showastree!!
    }

private var _Showastree: ImageVector? = null

