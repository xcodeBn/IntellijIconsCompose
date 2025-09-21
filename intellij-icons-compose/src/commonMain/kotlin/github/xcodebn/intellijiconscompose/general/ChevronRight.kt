package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!

        _ChevronRight = ImageVector.Builder(
            name = "ChevronRight",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(6f, 14f)
                lineTo(5f, 12f)
                lineTo(9f, 8f)
                lineTo(5f, 4f)
                lineTo(6f, 2f)
                lineTo(12f, 8f)
                lineTo(6f, 14f)
                close()
            }
        }.build()

        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

