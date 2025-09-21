package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!

        _ChevronDown = ImageVector.Builder(
            name = "ChevronDown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(8f, 12f)
                lineTo(2f, 6f)
                lineTo(4f, 5f)
                lineTo(8f, 9f)
                lineTo(12f, 5f)
                lineTo(14f, 6f)
                lineTo(8f, 12f)
                close()
            }
        }.build()

        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

