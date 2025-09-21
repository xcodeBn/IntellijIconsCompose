package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Push: ImageVector
    get() {
        if (_Push != null) return _Push!!

        _Push = ImageVector.Builder(
            name = "Push",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(6f, 3f)
                lineTo(13f, 10f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _Push!!
    }

private var _Push: ImageVector? = null

