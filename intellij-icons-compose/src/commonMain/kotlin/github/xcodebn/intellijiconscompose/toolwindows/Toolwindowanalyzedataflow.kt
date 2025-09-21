package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowanalyzedataflow: ImageVector
    get() {
        if (_Toolwindowanalyzedataflow != null) return _Toolwindowanalyzedataflow!!

        _Toolwindowanalyzedataflow = ImageVector.Builder(
            name = "Toolwindowanalyzedataflow",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 12f)
                lineTo(6f, 8f)
                lineTo(12f, 8f)
                lineTo(9f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 1f)
                lineTo(7f, 5f)
                horizontalLineTo(1f)
                lineTo(4f, 1f)
                close()
            }
        }.build()

        return _Toolwindowanalyzedataflow!!
    }

private var _Toolwindowanalyzedataflow: ImageVector? = null

