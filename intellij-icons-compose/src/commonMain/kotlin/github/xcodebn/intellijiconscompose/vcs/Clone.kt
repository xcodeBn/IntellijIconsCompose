package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clone: ImageVector
    get() {
        if (_Clone != null) return _Clone!!

        _Clone = ImageVector.Builder(
            name = "Clone",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 6f)
                lineTo(10f, 13f)
                lineTo(3f, 13f)
                close()
            }
        }.build()

        return _Clone!!
    }

private var _Clone: ImageVector? = null

