package github.xcodebn.intellijiconscompose.scope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tests: ImageVector
    get() {
        if (_Tests != null) return _Tests!!

        _Tests = ImageVector.Builder(
            name = "Tests",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(14f, 8f)
                lineTo(9f, 13f)
                lineTo(9f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(2f, 8f)
                lineTo(7f, 3f)
                lineTo(7f, 13f)
                close()
            }
        }.build()

        return _Tests!!
    }

private var _Tests: ImageVector? = null

