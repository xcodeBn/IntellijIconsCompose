package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Resume: ImageVector
    get() {
        if (_Resume != null) return _Resume!!

        _Resume = ImageVector.Builder(
            name = "Resume",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(8f, 2f)
                lineTo(9f, 2f)
                lineTo(15f, 8f)
                lineTo(9f, 13f)
                lineTo(8f, 13f)
                close()
            }
        }.build()

        return _Resume!!
    }

private var _Resume: ImageVector? = null

