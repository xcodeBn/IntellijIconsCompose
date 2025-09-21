package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) return _ChevronUp!!

        _ChevronUp = ImageVector.Builder(
            name = "ChevronUp",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(12f, 11f)
                lineTo(8f, 7f)
                lineTo(4f, 11f)
                lineTo(2f, 10f)
                lineTo(8f, 4f)
                lineTo(14f, 10f)
                lineTo(12f, 11f)
                close()
            }
        }.build()

        return _ChevronUp!!
    }

private var _ChevronUp: ImageVector? = null

