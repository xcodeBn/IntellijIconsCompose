package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoveToButton: ImageVector
    get() {
        if (_MoveToButton != null) return _MoveToButton!!

        _MoveToButton = ImageVector.Builder(
            name = "MoveToButton",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 5f)
                lineTo(9f, 8f)
                lineTo(4f, 8f)
                close()
            }
        }.build()

        return _MoveToButton!!
    }

private var _MoveToButton: ImageVector? = null

