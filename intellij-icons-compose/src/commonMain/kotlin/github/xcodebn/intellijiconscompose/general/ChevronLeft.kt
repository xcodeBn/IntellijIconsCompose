package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!

        _ChevronLeft = ImageVector.Builder(
            name = "ChevronLeft",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(10f, 14f)
                lineTo(4f, 8f)
                lineTo(10f, 2f)
                lineTo(11f, 4f)
                lineTo(7f, 8f)
                lineTo(11f, 12f)
                lineTo(10f, 14f)
                close()
            }
        }.build()

        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

