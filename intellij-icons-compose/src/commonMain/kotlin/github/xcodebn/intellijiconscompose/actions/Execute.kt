package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Execute: ImageVector
    get() {
        if (_Execute != null) return _Execute!!

        _Execute = ImageVector.Builder(
            name = "Execute",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 2f)
                lineTo(14f, 8f)
                lineTo(4f, 14f)
                close()
            }
        }.build()

        return _Execute!!
    }

private var _Execute: ImageVector? = null

